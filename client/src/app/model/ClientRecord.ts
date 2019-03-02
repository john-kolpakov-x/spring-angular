export class ClientRecord {
  public id: string;
  public surname: string;
  public name: string;
  public age: number;

  assign(a: any) {
    this.id = a.id;
    this.surname = a.surname;
    this.name = a.name;
    this.age = a.age;
  }

  static of(a: any): ClientRecord {
    let ret = new ClientRecord();
    ret.assign(a);
    return ret;
  }
}
