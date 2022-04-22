package com.ywalakamar.di;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("In After initialization method. Bean name is " + beanName);
        return BeanPostProcessor.super.postProcessAfterInitialization(bean,
                beanName);

    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("In Before initialization method. Bean name is " + beanName);
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean,
                beanName);
    }

}
