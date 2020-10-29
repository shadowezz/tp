package seedu.address.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import seedu.address.model.meeting.meeting.Meeting;

/**
 * An UI component that displays information of a {@code Meeting}.
 */
public class CalendarMeetingCard extends UiPart<Region> {
    private static final String FXML = "CalendarListMeetingCard.fxml";

    /**
     * Note: Certain keywords such as "location" and "resources" are reserved keywords in JavaFX.
     * As a consequence, UI elements' variable names cannot be set to such keywords
     * or an exception will be thrown by JavaFX during runtime.
     *
     * @see <a href="https://github.com/se-edu/addressbook-level4/issues/336">The issue on AddressBook level 4</a>
     */

    public final Meeting meeting;

    @FXML
    private HBox cardPane;
    @FXML
    private Label id;
    @FXML
    private Label title;
    @FXML
    private Label to;
    @FXML
    private Label from;

    /**
     * Creates a {@code MeetingCode} with the given {@code Meeting} and index to display.
     */
    public CalendarMeetingCard(Meeting meeting, int displayedIndex) {
        super(FXML);
        this.meeting = meeting;
        id.setText(displayedIndex + ". ");
        title.setText("Meeting: " + meeting.getTitle().value);
        from.setText(meeting.getFrom().toString());
        to.setText(meeting.getTo().toString());
    }

    @Override
    public boolean equals(Object other) {
        // short circuit if same object
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof CalendarMeetingCard)) {
            return false;
        }

        // state check
        CalendarMeetingCard card = (CalendarMeetingCard) other;
        return id.getText().equals(card.id.getText())
                && meeting.equals(card.meeting);
    }
}