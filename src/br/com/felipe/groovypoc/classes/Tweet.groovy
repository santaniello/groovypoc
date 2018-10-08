package br.com.felipe.groovypoc.classes

import java.time.OffsetDateTime

class Tweet {
    String text
    OffsetDateTime date

    void printTweet(){
        print "$text in date: $date"
    }
}
