package com.nimbus.refdata;

import com.nimbus.poc.events.Event;
import com.nimbus.poc.events.EventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by Kye on 01/05/15.
 */


@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "/refdata")
public class RestController {

    private final EventPublisher publisher;

    @Autowired
    public RestController(EventPublisher publisher) {

        this.publisher = publisher;
    }


    @RequestMapping(value = "/translation", method = RequestMethod.POST)
    public void addTranslation(@Valid @RequestBody String translation) {


        Event e = new Event();
        e.setMessage("new translation");

        System.out.println("Refdata received translation: " + translation);
        System.out.println("Refdata add to DB...: ");
        System.out.println("Refdata publish translation event: " + e);

        publisher.publish(e);
    }


    @RequestMapping(value = "/odbh", method = RequestMethod.POST)
    public void addodbh(@Valid @RequestBody String odbh) {

        Event e = new Event();
        e.setMessage("new OD BH ");

        System.out.println("Refdata received odbh CSV file... : " + odbh);
        System.out.println("Refdata add to DB...: ");
        System.out.println("Refdata publish obbh event: " + e);

        publisher.publish(e);
    }


}
