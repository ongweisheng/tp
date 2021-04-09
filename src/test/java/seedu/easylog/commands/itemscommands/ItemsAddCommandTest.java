package seedu.easylog.commands.itemscommands;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import seedu.easylog.exceptions.EmptyItemNameException;
import seedu.easylog.exceptions.NullItemNameException;
import seedu.easylog.model.ItemManager;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ItemsAddCommandTest {
    @Test
    @DisplayName("Items Should Be Added Correctly")
    public void itemsAddCommand_shouldBeAddedCorrectly() {
        ItemsAddCommand itemsAddCommand = new ItemsAddCommand();
        ItemManager itemManager = new ItemManager();
        ArrayList<String> itemDescriptionRecord = null;

        // Null item description
        NullItemNameException nullItemNameException = assertThrows(NullItemNameException.class, () -> {
            itemsAddCommand.execute(null, itemManager, itemDescriptionRecord);
        });

        // Empty item description
        EmptyItemNameException emptyItemNameException = assertThrows(EmptyItemNameException.class, () -> {
            itemsAddCommand.execute("", itemManager, itemDescriptionRecord);
        });
    }
}
