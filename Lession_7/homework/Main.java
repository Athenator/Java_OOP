package homework;

import homework.ContragentList.ListContrAgent;
import homework.communication.ListCommunicationMethod;
import homework.contragent.ContrAgent;
import homework.controll.ControlListContrAgent;

public class Main{
    public static void main(String[] args) {
// создание способов связаться с контрагентами
        ListCommunicationMethod ivanListCommunicationMethod = new ListCommunicationMethod();
        ListCommunicationMethod juliaListCommunicationMethod = new ListCommunicationMethod();
        ListCommunicationMethod piratListCommunicationMethod = new ListCommunicationMethod();
        ListCommunicationMethod blackCoubListCommunicationMethod = new ListCommunicationMethod();
// Создание контрагентов
        ContrAgent ivan = new ContrAgent("Ivan", 29, ivanListCommunicationMethod);
        ContrAgent julia = new ContrAgent("Julia", 27, juliaListCommunicationMethod);
        ContrAgent pirat = new ContrAgent("Pirat",piratListCommunicationMethod);
        ContrAgent blackCoub = new ContrAgent("blackCoub", blackCoubListCommunicationMethod);
// распечатать по одному контрагенту
        // System.out.println(ivan);
        // System.out.println(julia);
        // System.out.println(flagman);
        // System.out.println(blackCoub);
        // System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
// создание списка контрагентов
        ListContrAgent listContragent = new ListContrAgent();
// добавление контрагентов в список контрагентов
        listContragent.addContrAgentInList(ivan);
        listContragent.addContrAgentInList(julia);
        listContragent.addContrAgentInList(pirat);
        listContragent.addContrAgentInList(blackCoub);
// распечатать список контрагентов
        // listContragent.printListContrAgent();
// Добавление способов связи
        ivanListCommunicationMethod.addVkMethod("vk/111111");
        ivanListCommunicationMethod.addVkMethod("vk/222222");
        ivanListCommunicationMethod.addAdressMethod("ул.Пушкина дом 4");
        ivanListCommunicationMethod.addEmailMethod("fonoteka@mail.ru");
        ivanListCommunicationMethod.addTelegramMethod("@telebot");
        ivanListCommunicationMethod.addPhoneNumberMethod("89523467766");

        juliaListCommunicationMethod.addPhoneNumberMethod("8952435678");
        juliaListCommunicationMethod.addVkMethod("vk/777777");
        juliaListCommunicationMethod.addAdressMethod("ул.Голубева дом 77");

        piratListCommunicationMethod.addPhoneNumberMethod("2794356");
        piratListCommunicationMethod.addPhoneNumberMethod("2798899");
        piratListCommunicationMethod.addPhoneNumberMethod("2798822");
        piratListCommunicationMethod.addTelegramMethod("@piratTrue");
        piratListCommunicationMethod.addEmailMethod("piratGolg@mail.ru");

        blackCoubListCommunicationMethod.addVkMethod("vk/blackCoub");
        blackCoubListCommunicationMethod.addAdressMethod("ул.Воронова дом 666");
        blackCoubListCommunicationMethod.addPhoneNumberMethod("2798811");
        blackCoubListCommunicationMethod.addPhoneNumberMethod("2793300");
        blackCoubListCommunicationMethod.addTelegramMethod("@blackCoub");
        blackCoubListCommunicationMethod.addEmailMethod("blackCoub@mail.ru");
//контроллер списка контрагентв
        ControlListContrAgent controlListContrAgent = new ControlListContrAgent(listContragent);
// распечатпть список контрагентов
        controlListContrAgent.printListContrAgent();
// поиск конрагентов по имени
        controlListContrAgent.serchContrAgent("Pirat");
        controlListContrAgent.serchContrAgent("Julia");
// добавить способ связи с контрагентом
        controlListContrAgent.addNewComminicationMethodPhoneNumber(pirat, "22534");
// удалить способ связи с контрагентом
        controlListContrAgent.delComminicationMethodPhoneNumber(pirat, 0);
// добавить в список нового контрагента
        // controlListContrAgent.addNewContrAgent(listContragent, newName);
    }
}