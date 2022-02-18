class Forno {

  final int volume;
  final int tensao;
  final int potencia;
  final int largura;
  final int altura;
  final int profundidade;
  private int temperatura;
  private int timer;

  Forno(int volume, int tensao, int potencia, int largura, int altura, int profundidade){

    this.volume = volume;
    this.tensao = tensao;
    this.potencia = potencia;
    this.largura = largura;
    this.altura = altura;
    this.profundidade = profundidade;
    this.temperatura = 0;

  }

  private boolean temperaturaValida() {
    return this.temperatura < 200;
  }

  private boolean temperatura200() {
    return this.temperatura == 200;
  }

  private boolean temperatura220() {
    return this.temperatura == 220;
  }

  private boolean temperaturaValida250() {
    return this.temperatura == 250 && this.temperatura <= 300;
  }

  int temperatura() {
    return temperatura;
  }

  boolean ligado() {
    return this.temperatura > 0;
  }

  void aumentarTemperatura() {
    if(this.temperaturaValida()){
      this.temperatura += 50;
    } else if (this.temperatura200()) {
      this.temperatura += 20;
    } else if (this.temperatura220()) {
      this.temperatura += 30;
    } else if (this.temperaturaValida250()) {
      this.temperatura += 50;
    }
  }

  boolean diminuirValido() {
    return this.temperatura > 250;
  }

  boolean diminuir250() {
    return this.temperatura == 250;
  }

  boolean diminuir220() {
    return this.temperatura == 220;
  }

  boolean diminuir200() {
    return this.temperatura <= 200 && this.temperatura > 0;
  }

  boolean desligar2() {
    return this.temperatura == 50;
  }

  void diminuirTemperatura() {
    if(this.diminuirValido()){
      this.temperatura -= 50;
    } else if (this.diminuir250()){
      this.temperatura -= 30;
    } else if (this.diminuir220()){
      this.temperatura -= 20;
    } else if (this.diminuir200()){
      this.temperatura -= 50;
    } else if (this.desligar2()){
      this.temperatura -= 50;
    }

  }

  void setTimer(int minutos) {
    this.timer = minutos;
  }

  void tick() {
    this.timer--;
    if(timer == 0 ){
      this.desligar();
    }
  }

  int tempoRestante() {
    return timer;
  }

  void desligar() {
    this.temperatura = 0;
  }

}

