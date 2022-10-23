export class Order {

  id:number;
  order_name: string;
  data_created:Date;
  data_update:Date;
  description:string;
  image:string;
  price:number;


  constructor(id: number, order_name: string, data_created: Date, data_update: Date, description: string, image: string, price: number) {
    this.id = id;
    this.order_name = order_name;
    this.data_created = data_created;
    this.data_update = data_update;
    this.description = description;
    this.image = image;
    this.price = price;
  }

}
