export class Category {

  id:number;
  category_name: string;
  data_created:Date;
  data_update:Date;


  constructor(id: number, category_name: string, data_created: Date, data_update: Date) {
    this.id = id;
    this.category_name = category_name;
    this.data_created = data_created;
    this.data_update = data_update;
  }

}
