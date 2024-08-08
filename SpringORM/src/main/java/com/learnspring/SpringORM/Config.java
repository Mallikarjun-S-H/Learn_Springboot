package com.learnspring.SpringORM;

import java.util.Properties;
import javax.sql.DataSource;
import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = "Dao")
public class Config {
	
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/student_jdbc?createDatabaseIfNotExists=true");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(getDataSource());
		em.setPersistenceUnitName("mallik");
		em.setPackagesToScan("Dto");
		
		// Specify the JpaVendorAdapter
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        
     // Specify the EntityManagerFactory interface to avoid conflict
        em.setEntityManagerFactoryInterface(jakarta.persistence.EntityManagerFactory.class);
		
        em.setPersistenceProviderClass(HibernatePersistenceProvider.class);
		em.setJpaProperties(hibProperties());
		return em;
	}
	
	@Bean
	public Properties hibProperties() {
		Properties properties = new Properties();
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        properties.setProperty("hibernate.show_sql", "true");
        return properties;
	}
	 @Bean
	    public JpaTransactionManager transactionManager() {
	        JpaTransactionManager transactionManager = new JpaTransactionManager();
	        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
	        return transactionManager;
	    }
}
