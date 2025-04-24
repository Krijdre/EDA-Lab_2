import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Votaciones {

    public class Voto{
        private int id;
        private int votanteId;
        private int candidatoId;
        private String timeStamp;

        public Voto(int id, int votanteId, int candidatoId, String timeStamp){
            this.id = id;
            this.votanteId = votanteId;
            this.candidatoId = candidatoId;
            this.timeStamp = timeStamp;
        }

        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public int getVotanteId() {
            return votanteId;
        }
        public void setVotanteId(int votanteId) {
            this.votanteId = votanteId;
        }
        public int getCandidatoId() {
            return candidatoId;
        }
        public void setCandidatoId(int candidatoId) {
            this.candidatoId = candidatoId;
        }
        public String getTimeStamp() {
            return timeStamp;
        }
        public void setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
        }
    }

    public class Candidato{
        private int id;
        private String nombre;
        private String partido;
        private Queue<Votaciones.Voto> votosRecibidos;
        public Candidato(int id, String nombre, String partido) {
            this.id = id;
            this.nombre = nombre;
            this.partido = partido;
            this.votosRecibidos = new LinkedList<>();
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getPartido() {
            return partido;
        }
        public void setPartido(String partido) {
            this.partido = partido;
        }
        public Queue<Votaciones.Voto> getVotosRecibidos() {
            return votosRecibidos;
        }
        public void setVotosRecibidos(Queue<Votaciones.Voto> votosRecibidos) {
            this.votosRecibidos = votosRecibidos;
        }
    }

    public class Votante {
        private int id;
        private String nombre;
        private boolean yaVoto;
        public Votante(int id, String nombre, boolean yaVoto) {
            this.id = id;
            this.nombre = nombre;
            this.yaVoto = yaVoto;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public boolean getYaVoto() {
            return yaVoto;
        }
        public void setYaVoto(boolean yaVoto) {
            this.yaVoto = yaVoto;
        }
        public void marcarVoto(){
            yaVoto = true;
        }
    }

    public class UrnaElectoral {
        private LinkedList<Candidato> listaCandidatos;
        private Stack<Voto> historialVotos;
        private Queue<Voto> votosReportados;
        private int idCounter;
        public boolean verificarVotante(Votante voto){

        }
        public boolean registrarVoto(Votante votante, int candidatoId){

        }
        public boolean reportarVoto(Candidato candidato, int idVoto){

        }
        public String obtenerResultados(){
            
        }
    }
}
