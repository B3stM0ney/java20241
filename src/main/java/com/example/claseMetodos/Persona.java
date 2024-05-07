package com.example.claseMetodos;

public class Persona {
   
   private char estadoCivil;
   private int sueldo;
   private boolean mujer;
   
   
   public Persona(char estadoCivil, int sueldo, boolean mujer) {
      this.estadoCivil = estadoCivil;
      this.sueldo = sueldo;
      this.mujer = mujer;
   }
   
   public char getEstadoCivil() {
      return estadoCivil;
   }
   public void setEstadoCivil(char estadoCivil) {
      if (estadoCivil == 'c' || estadoCivil == 's' || estadoCivil == 'v') {
         this.estadoCivil = estadoCivil;
         }
   }
   public int getSueldo() {
      return sueldo;
   }
   public void setSueldo(int sueldo) {
      this.sueldo = sueldo;
   }
   public boolean isMujer() {
      return mujer;
   }
   public void setMujer(boolean mujer) {
      this.mujer = mujer;
   }


}
