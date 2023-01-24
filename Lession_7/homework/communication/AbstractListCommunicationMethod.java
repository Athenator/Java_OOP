package homework.communication;

import homework.contacts.InterfaceAdress;
import homework.contacts.InterfaceEmail;
import homework.contacts.InterfacePhoneNumber;
import homework.contacts.InterfaceTelegram;
import homework.contacts.InterfaceVk;

public class AbstractListCommunicationMethod implements InterfaceVk, InterfaceTelegram, InterfaceEmail,
                                                        InterfacePhoneNumber, InterfaceAdress{

    @Override
    public void vkMethod(){}

    @Override
    public void telegramMethod(){}

    @Override
    public void emailMethod(){}

    @Override
    public void phoneNumberMethod(){}

    @Override
    public void adressMethod() {}
}