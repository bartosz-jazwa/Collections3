package com.Kurs;

public class DanceClass {
    private Queue<Person> persons = new ArrayQueue();

    public String signIn(Person person){
        if (persons.isEmpty()){
            persons.push(person);
            return "Dodano "+person.getName()+" do kolejki";
        }else if(persons.peek().getSex()!=person.getSex()){
            Person partner = persons.poll();
            return person.getName()+" i "+partner.getName()+" tańczą razem";
        }else{
            persons.push(person);
            return "Dodano "+person.getName()+" do kolejki";
        }
    }
}
