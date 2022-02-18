class MaquinaAgua {

  int agua;
  int copos200;
  int copos300;

  MaquinaAgua(){

    this.agua = 0;
    this.copos200 = 0;
    this.copos300 = 0;

  }

int agua() {
    return agua;
  }

  int copos200() {
    return copos200;
  }

  int copos300() {
    return copos300;
  }

  void abastecerAgua(){
    this.agua = 20000;
  }

  void abastecerCopo200(){
    this.copos200 = 100;
  }

  public void abastecerCopo300() {
    this.copos300 = 100;
  }

  void servirCopo200(){
    if(agua > 200){
      if(copos200 > 0){
        this.agua -= 200;
        copos200--;
      }
    }
  }

  void servirCopo300(){
    if(agua > 300){
      if(copos300 > 0){
        this.agua -= 300;
        copos300--;
      }
    }
  }

}

