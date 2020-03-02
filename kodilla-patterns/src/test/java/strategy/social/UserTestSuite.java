package strategy.social;

import com.kodilla.patterns.strategy.social.*;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //given
        User millenialUser = new Millenials("Antoni");
        User YUser = new YGeneration("Mortadella");
        User ZUser = new ZGeneration("EndIsNear");

        //when
        String millenialUserPost = millenialUser.sharePost();
        System.out.println("Antoni posted: " + millenialUserPost);
        String YUserPost = YUser.sharePost();
        System.out.println("Mortadella posted: " + YUserPost);
        String ZUserPost = ZUser.sharePost();
        System.out.println("EndIsNear posted: " + ZUserPost);

        //then
        Assert.assertEquals("Share on Facebook", millenialUserPost);
        Assert.assertEquals("Share on Twitter", YUserPost);
        Assert.assertEquals("Share on Snapchat", ZUserPost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //given
        User millenialUser = new Millenials("Antoni");
        //when
        String millenialUserPost = millenialUser.sharePost();
        System.out.println("Antoni posted: " + millenialUserPost);
        millenialUser.setIndividualSocialPublisher(new TwitterPublisher());
        String millenialUserPostOnTwitter = millenialUser.sharePost();
        System.out.println("Antoni posted on Twitter now: " + millenialUserPostOnTwitter);
        //then
        Assert.assertEquals("Share on Twitter", millenialUserPostOnTwitter);
    }
}
