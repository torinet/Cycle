package ru.netology.services;
public class MonthsService {
    public int calculate(int income, int expense, int threshold)
    {
        int month = 0;
        int wallet = 0;
        for (int i = 0; i < 12; i++)
            if (wallet >= threshold) {//отдых
                wallet = wallet - expense;
                wallet = wallet / 3;
                month++;
            } else

    {//работа
        wallet = wallet + income;
        wallet = wallet - expense;
    }
        return month;
    } }

