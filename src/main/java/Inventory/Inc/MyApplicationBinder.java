/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory.Inc;

import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.CDI;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

/**
 *
 * @author A7mady
 */
public class MyApplicationBinder extends AbstractBinder {
  @Override
  protected void configure() {
    BeanManager bm = getBeanManager();
    bind(getBean(bm, MyResource.class))
        .to(MyResource.class);
  }

  private BeanManager getBeanManager() {
    // is there a better way to get the bean manager?
    return CDI.current().getBeanManager();
  }

  private <T> T getBean(BeanManager bm, Class<T> clazz) {
    Bean<T> bean = (Bean<T>) bm.getBeans(clazz).iterator().next();
    CreationalContext<T> ctx = bm.createCreationalContext(bean);
    return (T) bm.getReference(bean, clazz, ctx); 
  }
}
