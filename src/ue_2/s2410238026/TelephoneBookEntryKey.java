package ue_2.s2410238026;

import lecture.chapter03.IKey;

public class TelephoneBookEntryKey implements IKey {

    private String firstName;
    private String lastName;

    public TelephoneBookEntryKey(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean matches(Object data) {
        if (!(data instanceof TelephoneBookEntry)) {
            return false;
        }

        TelephoneBookEntry entry = (TelephoneBookEntry) data;

        return firstName.equals(entry.getFirstName())
            && lastName.equals(entry.getLastName());
    }
}
