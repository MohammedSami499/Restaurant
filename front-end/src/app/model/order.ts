export class Order {

  id:number;
  orderName:string;
  creationDate:Date;
  updateDate:Date;
  price:number;
  image:string;
  description:string;


  constructor(id: number, orderName: string, creationDate: Date, updateDate: Date, price: number, image: string, description: string) {
    this.id = id;
    this.orderName = orderName;
    this.creationDate = creationDate;
    this.updateDate = updateDate;
    this.price = price;
    this.image = image;
    this.description = description;
  }


}
