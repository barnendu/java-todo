package consolelog.academy.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebAppInitializer implements WebApplicationInitializer {
    private final static Logger log = LoggerFactory.getLogger(WebAppInitializer.class);
    private static final String DISPATCHER_SERVLET ="dispatcher";
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        log.info("webApp started...");
        AnnotationConfigWebApplicationContext context=
                new AnnotationConfigWebApplicationContext();
        context.register(WebConfig.class);

        //=== create and register dispatcher servlet===//
        DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
        ServletRegistration.Dynamic registration = servletContext.addServlet(DISPATCHER_SERVLET, dispatcherServlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("/");

    }
}
