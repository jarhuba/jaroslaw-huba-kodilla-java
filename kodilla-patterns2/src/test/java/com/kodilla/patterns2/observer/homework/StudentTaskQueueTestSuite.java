package com.kodilla.patterns2.observer.homework;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTaskQueueTestSuite {

    @Test
    public void testUpdate() {
        //Given
        StudentTaskQueue kowalskiStudent = new StudentTaskQueue("Kowalski");
        StudentTaskQueue michalowskiStudent = new StudentTaskQueue("Michałowski");
        Mentor linusTorvalds = new Mentor("Linus", "Torvalds");
        Mentor richardStallman = new Mentor("Richard", "Stallman");
        kowalskiStudent.registerObserver(linusTorvalds);
        michalowskiStudent.registerObserver(richardStallman);

        //when
        kowalskiStudent.addTask("Zadie napisz pętlę");
        kowalskiStudent.addTask("Oblicz iczbę pi");
        kowalskiStudent.addTask("Wylistuj dłużników");
        kowalskiStudent.addTask("Wyświetl logo");
        michalowskiStudent.addTask("Jedno jedyne zadanie");
        //then
        assertEquals(4, kowalskiStudent.getUpdateCount());
        assertEquals(1, michalowskiStudent.getUpdateCount());
    }
}
