package entidade;

public class Armazenmedic {

    public String medicamento;

    public String validade() {
        if (medicamento.equalsIgnoreCase("DIPIRONA")) {
            return "10/08/2026";
        } else if (medicamento.equalsIgnoreCase("PARACETAMOL")) {
            return "20/04/2026";
        } else if (medicamento.equalsIgnoreCase("IBUPROFENO")) {
            return "03/01/2027";
        }

        return "não encontrado.";
    }

    public String dosagem() {
        if (medicamento.equalsIgnoreCase("PARACETAMOL")) {
            return "10mg - 700mg";
        } else if (medicamento.equalsIgnoreCase("DIPIRONA")) {
            return "10mg - 500mg";
        } else if (medicamento.equalsIgnoreCase("IBUPROFENO")) {
            return "500mg";
        }

        return "não encontrado.";
    }

    public int quantidade() {
        if (medicamento.equalsIgnoreCase("PARACETAMOL")) {
            return 120;
        } else if (medicamento.equalsIgnoreCase("DIPIRONA")) {
            return 100;
        } else if (medicamento.equalsIgnoreCase("IBUPROFENO")) {
            return 200;
        }

        return 0; // se não encontrar
    }
}
