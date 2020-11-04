package seedu.address.logic.commands.person;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.logic.commands.person.CommandTestUtil.DESC_AMY;
import static seedu.address.logic.commands.person.CommandTestUtil.DESC_BOB;
import static seedu.address.logic.commands.person.CommandTestUtil.VALID_DESCRIPTION_BOB;
import static seedu.address.logic.commands.person.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.address.logic.commands.person.CommandTestUtil.VALID_NAME_BOB;
import static seedu.address.logic.commands.person.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.address.logic.commands.person.CommandTestUtil.VALID_ROLE_BOB;

import org.junit.jupiter.api.Test;

import seedu.address.logic.commands.person.EditCommand.EditPersonDescriptor;
import seedu.address.testutil.EditPersonDescriptorBuilder;

public class EditPersonDescriptorTest {

    @Test
    public void equals() {
        // same values -> returns true
        EditPersonDescriptor descriptorWithSameValues = new EditPersonDescriptor(DESC_AMY);
        assertTrue(DESC_AMY.equals(descriptorWithSameValues));

        // same object -> returns true
        assertTrue(DESC_AMY.equals(DESC_AMY));

        // null -> returns false
        assertFalse(DESC_AMY.equals(null));

        // different types -> returns false
        assertFalse(DESC_AMY.equals(5));

        // different values -> returns false
        assertFalse(DESC_AMY.equals(DESC_BOB));

        // different name -> returns false
        EditPersonDescriptor editedAmy = new EditPersonDescriptorBuilder(DESC_AMY).withName(VALID_NAME_BOB).build();
        assertFalse(DESC_AMY.equals(editedAmy));

        // different phone -> returns false
        editedAmy = new EditPersonDescriptorBuilder(DESC_AMY).withPhone(VALID_PHONE_BOB).build();
        assertFalse(DESC_AMY.equals(editedAmy));

        // different email -> returns false
        editedAmy = new EditPersonDescriptorBuilder(DESC_AMY).withEmail(VALID_EMAIL_BOB).build();
        assertFalse(DESC_AMY.equals(editedAmy));

        // different role -> returns false
        editedAmy = new EditPersonDescriptorBuilder(DESC_AMY).withRole(VALID_ROLE_BOB).build();
        assertFalse(DESC_AMY.equals(editedAmy));

        // different description -> returns false
        editedAmy = new EditPersonDescriptorBuilder(DESC_AMY).withDescription(VALID_DESCRIPTION_BOB).build();
        assertFalse(DESC_AMY.equals(editedAmy));

    }
}
