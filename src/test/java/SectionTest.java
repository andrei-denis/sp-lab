import org.junit.jupiter.api.Test;
import ro.uvt.models.AbstractElement;
import ro.uvt.models.Image;
import ro.uvt.models.Paragraph;
import ro.uvt.models.Section;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SectionTest {

    @Test
    public void givenSection_whenChildHasNoParent_thenAddChild(){
        Section section = new Section("Test");
        AbstractElement child = new Image("img");

        section.add(child);

        assertTrue(child == section.get(0));
    }

    @Test
    public void givenSection_whenChildHasParentAndSameSection_thenThrowException(){
        Section section = new Section("Test");
        AbstractElement child = new Image("img");

        section.add(child);

        assertThrows(UnsupportedOperationException.class, () -> section.add(child));
    }

    @Test
    public void givenSection_whenChildHasParentAndDifferentSection_thenThrowException(){
        Section section = new Section("Test");
        Section section1 = new Section("sec1");
        AbstractElement child = new Image("img");

        section.add(section1);

        section.add(child);

        assertThrows(UnsupportedOperationException.class, () -> section1.add(child));
    }

    @Test
    public void givenSection_whenChildAndParentAreTheSame_thenThrowException(){
        Section section = new Section("Test");

        assertThrows(UnsupportedOperationException.class, () -> section.add(section));
    }

    @Test
    public void givenImage_whenCallAggregateMethod_thenThrowException(){
        AbstractElement e = new Image("Test");

        assertThrows(UnsupportedOperationException.class, () -> e.add(new Paragraph("")));
        assertThrows(UnsupportedOperationException.class, () -> e.remove(new Paragraph("")));
        assertThrows(UnsupportedOperationException.class, () -> e.get(0));
    }

    @Test
    public void givenParagraph_whenCallAggregateMethod_thenThrowException(){
        AbstractElement e = new Paragraph("Test");

        assertThrows(UnsupportedOperationException.class, () -> e.add(new Paragraph("")));
        assertThrows(UnsupportedOperationException.class, () -> e.remove(new Paragraph("")));
        assertThrows(UnsupportedOperationException.class, () -> e.get(0));
    }

}
