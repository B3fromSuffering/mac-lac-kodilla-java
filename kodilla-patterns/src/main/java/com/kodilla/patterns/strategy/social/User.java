package com.kodilla.patterns.strategy.social;

public class User {
    final String userName;
    protected SocialPublisher socialPublisher;

    public User(String userName) {
        this.userName = userName;
    }

    public String sharePost() {
        return socialPublisher.share();
    }

    public void setIndividualSocialPublisher(SocialPublisher individualSocialPublisher) {
        this.socialPublisher = individualSocialPublisher;
    }
}
