public class Grupo
{
    private String nomMateria;
    private Estudiante[] estudiantes;
    
    public Grupo(int totalEstudiantes, String nomMateria)
    {
        estudiantes = new Estudiante[totalEstudiantes];
        this.nomMateria = nomMateria;
    }
    
    /**
     * Busca un estudiante por medio de su clave.
     * @param claveEstudiante Parametro que representa la clave del estudiante a buscar.
     * @return Regresa la posicion del estudiante en el arreglo o -1 si no existe.
     */
    private int buscarEstudiante(int claveEstudiante)
    {
        for(int i=0; i<estudiantes.length;i++)
        {
            if(estudiantes[i] != null){
                if(estudiantes[i].dimeClave() == claveEstudiante)
                {
                    return i;
                }
            }
        }
        return -1;
    }
    
    /**
     * Buswca un espacio disponible en el arreglo.
     * @return regresa la primer posicion nula dentro del arreglo.
     */
    private int buscaEspacioDisponible()
    {
        for(int i=0; i<estudiantes.length;i++)
        {
            if(estudiantes[i] == null){
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Inscribe un estudiante nuevo en el grupo.
     * @param unEstudiante Es el objeto estudiante a inscribir en el grupo.
     * @return Regresa verdadero si el estudiante fue inscrito o falso en caso de que 
     *          no se pudiera inscribir.
     */
    public boolean inscribir(Estudiante unEstudiante)
    {
            int existe = this.buscarEstudiante(unEstudiante.dimeClave());
            if(existe != -1){
                return false; // el estudiante ya esta inscrito
            }
            int posDisponible = this.buscaEspacioDisponible();
            if(posDisponible == -1){
                return false; //el arreglo esta lleno
            }
            estudiantes[posDisponible] = unEstudiante; // inscribe al estudiante
            return true; // el estudiante fue inscrito.
    }
    
    public void darBaja(int claveEstudiante)
    {
        //Buscar el estudiante con la clave dada
        // y asignarle un null
        /*
        for(int i=0; i<estudiantes.length;i++){
            if(claveEstudiante == Estudiante.dimeClave()){
                estudiantes[i]= null;
            }
        }*/
    }
}