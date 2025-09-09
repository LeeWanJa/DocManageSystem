//package test.java.comjaewan.docmanagesystem.importing;
//
//import main.java.com.jaewan.docmanagesystem.domain.Document;
//import org.junit.jupiter.api.Test;
//import main.java.com.jaewan.docmanagesystem.domain.Attributes.*;
//
//@Test
//public class shouldImportLetterAttributes {
//    system.importFile(LETTER);
//
//    final Document document = onlyDocument();
//
//    assertAttributeEquals(document, PATIENT, JOE_BLOGGS);
//    assertAttributeEquals(document, ADDRESS,
//                          "123 Fake Street\n" +
//                        "Westminster\n" +
//                        "London\n" +
//                        "United Kingdom");
//    assertAttributeEquals(document, BODY,
//                          "We are writing to you to confirm the re-scheduling of your appointment\n" +
//                          "with Dr. Avaj from 29th December 2016 to 5th January 2017.");
//    assertTypeIs("LETTER", document);
//}
