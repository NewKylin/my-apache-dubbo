<template>

    <div>

        <Form ref="formLeft1" :model="formLeft1" label-position="left" :label-width="100" inline class="form-common">
            <FormItem label="姓名" prop="input1">
                <Input type="text" v-model="formLeft1.input1"></Input>
            </FormItem>
            <FormItem label="手机号">
                <Input type="text" v-model="formLeft1.input2"></Input>
            </FormItem>
            <FormItem label="身份证号">
                <Input type="text" v-model="formLeft1.input3"></Input>
            </FormItem>


            <FormItem>
                <Button type="primary">搜索</Button>
                <Button @click="handleReset('formLeft1')" style="margin-left: 8px">清空</Button>
            </FormItem>
        </Form>
        <Divider />

                <Table :columns="columns" :data="data">

                </Table>
    </div>


</template>
<script>
    let testData = {
        "data": [
            {
                name: '王小明',
                age: 18,
                birthday: '919526400000',
                address: '北京市朝阳区芍药居'
            },
            {
                name: '张小刚',
                age: 25,
                birthday: '696096000000',
                address: '北京市海淀区西二旗'
            },
            {
                name: '李小红',
                age: 30,
                birthday: '563472000000',
                address: '上海市浦东新区世纪大道'
            },
            {
                name: '周小伟',
                age: 26,
                birthday: '687024000000',
                address: '深圳市南山区深南大道'
            }
        ],
    }
    //可以给外界通过import导入
    export default {
        data () {
            return {
                columns: [
                    {
                        title: '姓名',
                        key: 'name'
                    },
                    {
                        title: '年龄',
                        key: 'age'
                    },
                    {
                        title: '出生日期',
                        key: 'birthday'
                    },
                    {
                        title: '地址',
                        key: 'address'
                    }
                ],
                split2: 0.5,
                data:[],
                ajaxData:[],
                formLeft1: {
                    input1: '',
                    input2: '',
                    input3: ''
                },
                editIndex: -1,  // 当前聚焦的输入框的行数
                editName: '',  // 第一列输入框，当然聚焦的输入框的输入内容，与 data 分离避免重构的闪烁
                editAge: '',  // 第二列输入框
                editBirthday: '',  // 第三列输入框
                editAddress: '',  // 第四列输入框
                dataCount:0,
                pageSize:10,
            }
        },
        methods: {
            handleEdit (row, index) {
                this.editName = row.name;
                this.editAge = row.age;
                this.editAddress = row.address;
                this.editBirthday = row.birthday;
                this.editIndex = index;
            },
            handleSave (index) {
                this.data[index].name = this.editName;
                this.data[index].age = this.editAge;
                this.data[index].birthday = this.editBirthday;
                this.data[index].address = this.editAddress;
                this.editIndex = -1;
            },
            getBirthday (birthday) {
                const date = new Date(parseInt(birthday));
                const year = date.getFullYear();
                const month = date.getMonth() + 1;
                const day = date.getDate();
                return `${year}-${month}-${day}`;
            },
            handleReset (name) {
                debugger
                this.$refs[name].resetFields();
            },
            handlerQuery(){
                debugger
                this.ajaxData = testData.data;
                this.dataCount = testData.data.length;
                if(this.dataCount < this.pageSize){
                    this.data = this.ajaxData;
                }else{
                    this.data = this.ajaxData.slice(0,this.page);
                }
            },
            changePage(index){
                let start = (index-1) * this.pageSize;
                let end = index * this.pageSize;
                this.data = this.ajaxData.slice(start,end);
            },

        },
        created(){
            this.handlerQuery();
        }
    }
</script>
<style>
    .form-common{
        padding-left: 20px;
        padding-top: 20px;
    }

</style>