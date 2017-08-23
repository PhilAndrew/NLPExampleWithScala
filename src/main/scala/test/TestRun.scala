package test

import edu.stanford.nlp.simple._

/**
  * Created by philipandrew on 23/8/2017.
  */
object TestRun extends App {

  val sent = new Sentence("Lucy is in the sky with diamonds.")
  val nerTags = sent.nerTags()  // [PERSON, O, O, O, O, O, O, O]
  val firstPOSTag = sent.posTag(0)   // NNP

  println(nerTags)
  println(firstPOSTag)

  // Create a document. No computation is done yet.
  import scala.collection.JavaConversions._

  val doc = new Document(" During the Initial Term, Licensee shall pay to Fox a non-refundable minimum “Guarantee” for the Exhibition in the amount of Two Million U.S. Dollars ($2,000,000), which Guarantee shall be the sum of the Advance and the “Annual License Fees” (each, defined below) payable in accordance to the schedule below.  Four Hundred Thousand U.S. Dollars ($400,000) of the Advance (as defined in Section 6(a)(ii) below) shall be recoupable against only the Ticket & Entertainment Royalty and Merchandising Royalty earned between the Effective Date and the earlier of one year after the Opening Date or March 31, 2017.  The remaining Three Hundred Fifty Thousand U.S. Dollars ($350,000) of the Advance shall be recoupable against only the Ticket & Entertainment Royalty and Merchandising Royalty earned during the period between the date one year after the Opening Date (and in any event no later than March 30, 2017) and the date two years after the Opening Date (and in any event no later than March 30, 2018).  Thereafter, each Annual License Fee shall be recoupable against only the Ticket & Entertainment Royalty and Merchandising Royalty earned with respect to the Exhibition during the twelve (12)-month period immediately following the payment due date of such Annual License Fee, and may not be cross collateralized against any other payments or fees.  For the avoidance of doubt and without limitation, neither the Advance, Annual License Fees, nor the Guarantee are recoupable against the Sponsorship Royalty or any other Royalty contemplated in this Agreement.  The Guarantee shall be payable as an Advance and Annual License Fees in accordance with the following schedule:")
  for (sent <- doc.sentences) { // Will iterate over two sentences
    // We're only asking for words -- no need to load any models yet
    /*
    System.out.println("The second word of the sentence '" + sent + "' is " + sent.word(1))
    // When we ask for the lemma, it will load and run the part of speech tagger
    System.out.println("The third lemma of the sentence '" + sent + "' is " + sent.lemma(2))
    // When we ask for the parse, it will load and run the parser
    System.out.println("The parse of the sentence '" + sent + "' is " + sent.parse)
*/
    println("---")
    println(sent.toString)
    for (tag <- sent.nerTags().zipWithIndex) {
      println(sent.word(tag._2) + " " + tag._1)
    }
    // ...
  }
}
