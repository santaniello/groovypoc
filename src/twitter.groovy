import br.com.felipe.groovypoc.classes.Tweet

import java.time.OffsetDateTime

class Teste{

    void printText(){
        print "textt"
    }

}

def tweet = new Tweet(text: "Hello twitter",date: OffsetDateTime.now())
tweet.printTweet()

def teste = new Teste()
teste.printText()

