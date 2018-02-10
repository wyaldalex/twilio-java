/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml.messaging;

import com.twilio.http.HttpMethod;
import org.junit.Assert;
import org.junit.Test;

import java.net.URI;

/**
 * Test class for {@link Message}
 */
public class MessageTest {
    @Test
    public void testEmptyElement() {
        Message elem = new Message.Builder().build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Message/>",
            elem.toXml()
        );
    }

    @Test
    public void testEmptyElementUrl() {
        Message elem = new Message.Builder().build();

        Assert.assertEquals("%3C%3Fxml+version%3D%221.0%22+encoding%3D%22UTF-8%22%3F%3E%3CMessage%2F%3E", elem.toUrl());
    }

    @Test
    public void testElementWithParams() {
        Message elem = new Message.Builder("body")
            .to("to")
            .from("from")
            .action(URI.create("https://example.com"))
            .method(HttpMethod.GET)
            .statusCallback(URI.create("https://example.com"))
            .build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Message action=\"https://example.com\" from=\"from\" method=\"GET\" statusCallback=\"https://example.com\" to=\"to\">body</Message>",
            elem.toXml()
        );
    }

    @Test
    public void testElementWithExtraAttributes() {
        Message elem = new Message.Builder().option("foo", "bar").option("a", "b").build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Message a=\"b\" foo=\"bar\"/>",
            elem.toXml()
        );
    }

    @Test
    public void testElementWithChildren() {
        Message.Builder builder = new Message.Builder();

        builder.body(new Body.Builder("message").build());

        builder.media(new Media.Builder(URI.create("https://example.com")).build());

        Message elem = builder.build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Message>" +
                "<Body>message</Body>" +
                "<Media>https://example.com</Media>" +
            "</Message>",
            elem.toXml()
        );
    }
}