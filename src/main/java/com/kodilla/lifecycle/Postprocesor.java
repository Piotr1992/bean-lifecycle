package com.kodilla.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.cglib.core.ClassNameReader;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Postprocesor implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        Logger logger = Logger.getLogger(Postprocesor.class.getName());
        logger.log(Level.INFO,"Bean " + beanName + " created!");

        return bean;

    }

}