class MaquinaAguaConfiguravel {

  int agua;
  int copos200;
  int copos300;
  final int capacidadeAgua;
  final int capacidadeCopos200;
  final int capacidadeCopos300;

  MaquinaAguaConfiguravel(final int capacidadeAgua, final int capacidadecopos200, final int capacidadecopos300){

    this.agua = 0;
    this.copos200 = 0;
    this.copos300 = 0;
    this.capacidadeAgua = capacidadeAgua;
    this.capacidadeCopos200 = capacidadecopos200;
    this.capacidadeCopos300 = capacidadecopos300;

    if(capacidadeAgua <= 0){
      throw new IllegalStateException("Quantidade água deve ser positivo");
    }

    if(capacidadecopos200 <= 0){
      throw new IllegalStateException("Copos de 200mL deve ser positivo");
    }

    if(capacidadecopos300 <= 0){
      throw new IllegalStateException("Copos de 300mL deve ser positivo");
    }

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

  void abastecerAgua() {
    this.agua = this.capacidadeAgua;
  }

  void abastecerCopo200() {
    this.copos200 = this.capacidadeCopos200;
  }

  void abastecerCopo300() {
    this.copos300 = this.capacidadeCopos300;
  }

  boolean haAguaDisponivel200() {
    return this.agua >= 200;
  }

  boolean haAguaDisponivel300() {
    return this.agua >= 300;
  }

  boolean haCopos200Disponivel() {
    return this.copos200 > 0;
  }

  boolean haCopos300Disponivel() {
    return this.copos300 > 0;
  }

  void servirCopo200() {
    if(this.haAguaDisponivel200()){
      if(this.haCopos200Disponivel()){
        this.agua -= 200;
        copos200--;
      } else {
        throw new IllegalStateException("Não há copos de 200mL");
      }
    } else {
      throw new IllegalStateException("Não há água");
    }
  }

  void servirCopo300() {
    if (this.haAguaDisponivel300()) {
      if (this.haCopos300Disponivel()) {
        this.agua -= 300;
        copos300--;
      } else {
        throw new IllegalStateException("Não há copos de 300mL");
      }
    } else {
      throw new IllegalStateException("Não há água");
    }
  }

}
