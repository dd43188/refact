package com.water.bird;

public class Bird {

    public interface Tweetable {
        void tweet();
    }
    public interface Eggable {
        void egg();
    }

    public class Tweetability implements Tweetable {
        @Override
        public void tweet() {
            //do something
        }
    }

    public class Eggability implements  Eggable {
        @Override
        public void egg() {
            //do something
        }
    }

    public class Ostrich implements Tweetable, Eggable {
        private Tweetability tweetability = new Tweetability();
        private Eggability eggability = new Eggability();
        @Override
        public void tweet() {
            tweetability.tweet();
        }

        @Override
        public void egg() {
            eggability.egg();
        }
    }
}
