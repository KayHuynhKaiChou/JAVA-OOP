
package controller;

import java.io.IOException;
import helper.*;
import java.util.Random;
import model.*;


public class CDHouse extends Menu<String> {

    private static String[] selections = {"Add CD", "Search CD by title",
        "Show CD catalog", "Update CD", "Save CD data", "Show CD list"};
    private static String header = "CD House";
    private CDList cDList;

    public CDHouse(CDList cDList) {
        super(header, selections);
        try {
            this.cDList = (CDList) FileService.readFile();
        } catch (IOException | ClassNotFoundException ex) {
            this.cDList = cDList;
        }
    }

    private CD creatCD(CD cd, int id) {
        String title = Helper.forcedMatchesRegex("enter title", "[a-z ]{1,}");
        double price = Double.parseDouble(Helper.forcedMatchesRegex("Enter price ",
                "^(?:[1-9][0-9]{0,3}(?:\\.\\d{1,3})?|10000|10000.00)$"));
        String getType = Helper.forcedMatchesRegex("enter type audio or vidoe (a,v)", "[a|v]");
        char type = getType.charAt(0);
        int publishingYear = Integer.parseInt(Helper.forcedMatchesRegex("enter publishing year", "[1-9][0-9]{1,}"));
        cd.setId(id);
        cd.setTitle(title);
        cd.setPrice(price);
        cd.setType(type);
        cd.setYear(publishingYear);
        setCollection(cd);
        return cd;
    }

    private void setCollection(CD e) {
        Menu menu = new Menu<String>("choose collection", new String[]{"game", "movie", "music"}) {
            @Override
            public void execute(int n) {
                switch (n) {
                    case 1 -> {
                        e.setCollectionName("game");
                    }
                    case 2 -> {
                        e.setCollectionName("movie");
                    }
                    case 3 -> {
                        e.setCollectionName("music");
                    }
                }
            }
        };
        menu.runOnetime();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1 -> {
                boolean a = true;
                while (a) {
                    if (cDList.spaceCheck(700)) {
                        int id = new Random().ints(10000000, 99999999).findFirst().getAsInt();
                        cDList.add(creatCD(new CD(), id));
                        a = !Helper.getBoolean("Go back to main menu ");
                    } else {
                        Helper.notice("unable to add sir");
                        break;
                    }
                }
            }
            case 2 -> {
                boolean a = true;
                while (a) {
                    String searchTitle = Helper.forcedMatchesRegex("Enter title", "[a-zA-Z0-9]{1,}");
                    CDList result = cDList.search(searchTitle);
                    if (!result.isEmpty()) {
                        result.showList();
                    } else {
                        Helper.notice("Not found");
                    }
                    a = !Helper.getBoolean("Go back to main menu ");
                }
            }
            case 3 -> {
                boolean a = true;
                while (a) {
                    if (!cDList.isEmpty()) {
                        cDList.showList();
                    } else {
                        Helper.notice("There are no cd sir :)))");
                    }
                    a = !Helper.getBoolean("Go back to main menu ");
                }
            }
            case 4 -> {
                boolean a = true;
                while (a) {
                    String searchID = Helper.forcedMatchesRegex("Enter ID", "[0-9]{8}");
                    CDList result = cDList.search(searchID);
                    if (!result.isEmpty()) {
                        CD cd = result.get(0);
                        Menu menuUpdate = new Menu<String>("Update CD press 0 to exit",
                                new String[]{"Update", "Delete"}) {
                            @Override
                            public void execute(int n) {
                                switch (n) {
                                    case 1 -> {
                                        creatCD(cd, cd.getId());
                                    }
                                    case 2 -> {
                                        cDList.remove(cd);
                                        Helper.notice("Success");
                                    }
                                }
                            }
                        };
                        menuUpdate.run();
                    } else {
                        Helper.notice("Not found");
                    }
                    a = !Helper.getBoolean("Go back to main menu ");
                }

            }
            case 5 -> {
                try {
                    FileService.writeFile(cDList);
                    Helper.notice("Success");
                } catch (IOException ex) {
                    Helper.notice("Fail");
                }
            }

            case 6 -> {
                boolean a = true;
                while (a) {
                    cDList.showList();
                    a = !Helper.getBoolean("Go back to main menu ");
                }
            }
        }
    }
}
