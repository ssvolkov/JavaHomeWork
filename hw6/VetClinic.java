package com.pb.volkov.hw6;

import java.lang.reflect.Constructor;

public class VetClinic {
    public static void main(String[] args) throws Exception{

        Dog firstDog = new Dog ("Гааав!", "Буся", "Диетический собачий корм", "Италия.");
        Cat firstCat = new Cat ("Мяяя-ууу!", "Рыжик", "Индейка", "Украина.");
        Horse firstHorse = new Horse("Прф-фррр!", "Мустанг", "Отруби + витамины", "Англия.");

        Animal [] animals = new Animal[ ] {firstDog, firstCat, firstHorse};

        Class<?> vetClazz = Class.forName("com.pb.volkov.hw6.Veterinarian");
        Constructor<?> construct = vetClazz.getConstructor();
        Object obj = construct.newInstance();
        for (Animal anim:animals) {
            ((Veterinarian) obj).treatAnimal(anim);
        }
    }
}