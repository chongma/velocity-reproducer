package com.mycompany.app;

import javax.enterprise.context.ApplicationScoped;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import java.io.StringWriter;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;
import java.io.IOException;

@ApplicationScoped
public class MyApplicationScopedBean {

    public void tryVelocity() {
        try {
			VelocityEngine velocityEngine = new VelocityEngine();
			velocityEngine.init();
			Template t = velocityEngine.getTemplate("index.vm");
			VelocityContext context = new VelocityContext();
			context.put("name", "World");
			StringWriter writer = new StringWriter();
			t.merge(context, writer);
		} catch (ResourceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseErrorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MethodInvocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
