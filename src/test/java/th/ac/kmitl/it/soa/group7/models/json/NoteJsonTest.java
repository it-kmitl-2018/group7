package th.ac.kmitl.it.soa.group7.models.json;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NoteJsonTest {
    
    private String subject;
    private String content;

    @Test
    public void shouldGetAllInfo() {
        NoteJson note = NoteJson.builder()
                .content(this.content)
                .subject(this.subject)
                .build();

        assertEquals(this.content, note.content);
        assertEquals(this.subject, note.subject);
    }

}
