package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.SnapchatPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("Stanisław");
        User user2 = new YGeneration("Ron");
        User user3 = new ZGeneration("Neo");

        //When
        String message1 = user1.sharePost();
        String message2 = user2.sharePost();
        String message3 = user3.sharePost();

        //Then
        Assert.assertEquals("Facebook", message1);
        Assert.assertEquals("Twitter", message2);
        Assert.assertEquals("Snapchat", message3);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user1 = new Millenials("Stanisław");

        //When
        user1.setSocialPublisher(new SnapchatPublisher());
        String message1 = user1.sharePost();

        //Then
        Assert.assertEquals("Snapchat", message1);
    }
}
