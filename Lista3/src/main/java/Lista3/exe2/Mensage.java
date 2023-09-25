package Lista3.exe2;

public class Mensage {

    private String text;
    private Person person;

    public Mensage(String text, Person person) {
        this.setText(text);
        this.setPerson(person);
    }

    public Mensage() {
    }

    public String getText() {
        return text;
    }

    public final void setText(String text) {
        this.text = text;
    }

    public Person getPerson() {
        return person;
    }

    public final void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "\nMensage{" + "text=" + text + ", person=" + person.toString() + '}';
    }
}
