package Question1;

import Question1.CustomEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware {
  private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;


    }
    public void publish(Employee employee)
    {
        CustomEvent customEvent=new CustomEvent(this,employee);
        applicationEventPublisher.publishEvent(customEvent);
    }
}


