package exam03retake01;

import java.util.ArrayList;
import java.util.List;

public class MailBox {

    private List<Mail> mails = new ArrayList<>();

    public List<Mail> getMails() {
        return mails;
    }

    public List<Mail> findByCriteria(String criteria) {
        String[] temp = criteria.split(":");
        List<Mail> searchedMails = new ArrayList<>();
        for (Mail mail: mails) {
            if (temp[0].equals("from") && findFromFieldMail(mail, temp[1])) {
                searchedMails.add(mail);
            }
            if (temp[0].equals("to")) {
                for (Mail mailItem: findToFieldInMail(mail, temp[1])) {
                    searchedMails.add(mailItem);
                }
            }
            if (findSubjectMessage(mail, temp[0])) {
                searchedMails.add(mail);
            }
        }
        return searchedMails;
    }

    private boolean findFromFieldMail(Mail mail, String str) {
        if (str.equals(mail.getFrom().getName()) || str.equals(mail.getFrom().getEmail())) {
            return true;
        }
        return false;
    }

    private List<Mail> findToFieldInMail(Mail mail, String str) {
        List<Mail> mailList = new ArrayList<>();
        for (Contact contact: mail.getTo()) {
            if (str.equals(contact.getName()) || str.equals(contact.getEmail())) {
                mailList.add(mail);
            }
        }
        return mailList;
    }

    private boolean findSubjectMessage(Mail mail, String str) {
        if (mail.getMessage().contains(str) || mail.getSubject().contains(str)) {
            return true;
        }
        return false;
    }

    public void addMail(Mail mail) {
        mails.add(mail);
    }
}
