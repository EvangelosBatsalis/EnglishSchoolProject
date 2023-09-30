package gr.vbatsalis.EnglishSchoolProject.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

//Only if with the use of JdbcTemplate
@Configuration
public class AppJdbcTemplateConfig {

    @Autowired
    private DataSource dataSource;

    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(dataSource);
    }

}
