//package test.java.comjaewan.docmanagesystem.importing;
//
//import main.java.com.jaewan.docmanagesystem.domain.Attributes;
//import main.java.com.jaewan.docmanagesystem.domain.Document;
//import org.junit.jupiter.api.Test;
//
//import java.util.List;
//
//@Test
//public class ShouldImportImageAttributes {
//    system.importFile(XRAY);
//
//    final Document document = onlyDocument();
//
//    assertAttributeEquals(document, Attributes.WIDTH, "320");
//    assertAttributeEquals(document, Attributes.HEIGHT, "179");
//    assertTypeIs("IMAGE", document);
//
//    private void assertAttributeEquals(final Document document, final String attributeName, final String expectedValue){
//        assertEquals(
//                "Document has the wrong value for " + attributeName,
//                expectedValue,
//                document.getAttribute(attributeName));
//    }
//
//    private Document onlyDocument() {
//        final List<Document> docs = system.contents();
//        assertThat(documents, hasSize(1));
//        return documents.get(0);
//    }
//}
