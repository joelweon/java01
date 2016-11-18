package step17;

public class Score {
  String _name;
  private int _kor;
  private int _eng;
  private int _math;
  private int _sum;
  private float _average;

  public Score(String name, int kor, int eng, int math) {
    this._name = name;
    this._kor = kor;
    this._eng = eng;
    this._math = math;
    this._sum = kor + eng + math;
    this._average = this._sum / 3.0f;
  }

  private void compute() {
    this._sum = this._kor + this._eng + this._math;
    this._average = this._sum / 3f;
  }

  public void setKor(int kor) {
    this._kor = kor;
    this.compute();
  }

  public void setEng(int eng) {
    this._eng = eng;
    this.compute();
  }

  public void setMath(int math) {
    this._math = math;
    this.compute();
  }

  public int getKor() {return this._kor;}
  public int getEng() {return this._eng;}
  public int getMath() {return this._math;}
  

  public int getSum() {
    return this._sum;
  }

  public float getAverage() {
    return this._average;
  }

  @Override 
  public String toString() {
    return String.format("%s,%d,%d,%d,%d,%f",
      this._name, this._kor, this._eng, this._math, this._sum, this._average);

    //String value = String.format("%s,%d,%d,%d,%d,%f",
    //  this.name, this.kor, this.eng, this.math, this.sum, this.average);
    //return value;
    //현업에서는 위의 오버라이드를 사용.
  }
//class이름@hash값을 보기 싫다면 Override를 통해 의미있는 값을 보여줄 것.

}
