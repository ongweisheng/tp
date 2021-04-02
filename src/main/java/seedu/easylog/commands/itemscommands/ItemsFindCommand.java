package seedu.easylog.commands.itemscommands;

import seedu.easylog.exceptions.EmptyItemNameException;
import seedu.easylog.exceptions.ItemNotFoundException;
import seedu.easylog.model.ItemManager;

public class ItemsFindCommand extends ItemsCommand {
    /**
     * Print out all the found items in the found list.
     */
    public void execute(String itemDescription, ItemManager itemManager) 
        throws EmptyItemNameException, ItemNotFoundException {
        if (itemDescription.equals("")) {
            throw new EmptyItemNameException();
        }
        itemManager.findItem(itemDescription);
        if (itemManager.getFoundSize() == 0) {
            throw new ItemNotFoundException();
        }
        String rawFoundListOutput = itemManager.getFoundListPrintFormat(itemManager.getFoundList());
        ui.showFoundList(rawFoundListOutput);
        itemManager.clearFoundList();
    }
}
