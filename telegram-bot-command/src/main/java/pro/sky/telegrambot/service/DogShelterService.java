package pro.sky.telegrambot.service;

import com.pengrad.telegrambot.TelegramBot;
import org.springframework.stereotype.Service;
import pro.sky.telegrambot.entity.DogShelterPerson;
import pro.sky.telegrambot.entity.Person;
import pro.sky.telegrambot.model.DogShelter;
import pro.sky.telegrambot.repository.DogShelterPersonRepository;
import pro.sky.telegrambot.repository.PersonRepository;
import pro.sky.telegrambot.repository.ReportRepository;

/**
 * Пока в работе
 */

@Service
public class DogShelterService extends ShelterService{

    public DogShelterService(DogShelter dogShelter, DogShelterPersonRepository contactRepository, ReportRepository reportRepository, TelegramBot telegramBot) {

        super(dogShelter, contactRepository, reportRepository, telegramBot);
    }

    public String getApprovedCynologysts() {
        DogShelter dogShelter = (DogShelter) this.getShelter();
        return dogShelter.getApprovedCunologysts();
    }

    public String getCynologystsAdvices() {
        DogShelter dogShelter = (DogShelter) this.getShelter();
        return dogShelter.getCynologystsAdvices();
    }


}
