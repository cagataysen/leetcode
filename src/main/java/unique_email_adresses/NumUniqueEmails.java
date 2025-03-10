package unique_email_adresses;

import java.util.HashSet;

public class NumUniqueEmails {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> filteredEmailSet = new HashSet<>();

        for (String email: emails){
            String[] parts = email.split("@");
            String localName = parts[0];
            String domainName = parts[1];

            localName = localName.replace(".", "");

            if(localName.contains("+")){
                int plusIndex = localName.indexOf("+");
                localName = localName.substring(0, plusIndex);
            }

            filteredEmailSet.add(localName + "@" + domainName);
        }

        return filteredEmailSet.size();
    }
}
