<template>
  <div>
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      label-width="80px"
	  style="background: transparent;"
    >  
     <el-row>
      <el-col :span="12">
        <el-form-item   v-if="flag=='banzhuren'"  label="班主任工号" prop="banzhurengonghao">
          <el-input v-model="ruleForm.banzhurengonghao" readonly              placeholder="班主任工号" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='banzhuren'"  label="班主任姓名" prop="banzhurenxingming">
          <el-input v-model="ruleForm.banzhurenxingming"               placeholder="班主任姓名" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="24">  
        <el-form-item v-if="flag=='banzhuren'" label="照片" prop="zhaopian">
          <file-upload
          tip="点击上传照片"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.zhaopian?ruleForm.zhaopian:''"
          @change="banzhurenzhaopianUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item v-if="flag=='banzhuren'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie"  placeholder="请选择性别">
            <el-option
                v-for="(item,index) in banzhurenxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='banzhuren'"  label="班级" prop="banji">
          <el-input v-model="ruleForm.banji"               placeholder="班级" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='banzhuren'"  label="班主任电话" prop="banzhurendianhua">
          <el-input v-model="ruleForm.banzhurendianhua"               placeholder="班主任电话" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='banzhuren'"  label="身份证" prop="shenfenzheng">
          <el-input v-model="ruleForm.shenfenzheng"               placeholder="身份证" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='banzhuren'"  label="工作证" prop="gongzuozheng">
          <el-input v-model="ruleForm.gongzuozheng"               placeholder="工作证" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='jiazhang'"  label="家长账号" prop="jiazhangzhanghao">
          <el-input v-model="ruleForm.jiazhangzhanghao" readonly              placeholder="家长账号" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='jiazhang'"  label="家长姓名" prop="jiazhangxingming">
          <el-input v-model="ruleForm.jiazhangxingming"               placeholder="家长姓名" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='jiazhang'"  label="年龄" prop="nianling">
          <el-input v-model="ruleForm.nianling"               placeholder="年龄" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item v-if="flag=='jiazhang'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie"  placeholder="请选择性别">
            <el-option
                v-for="(item,index) in jiazhangxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
      <el-col :span="24">  
        <el-form-item v-if="flag=='jiazhang'" label="照片" prop="zhaopian">
          <file-upload
          tip="点击上传照片"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.zhaopian?ruleForm.zhaopian:''"
          @change="jiazhangzhaopianUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='jiazhang'"  label="家长手机" prop="jiazhangshouji">
          <el-input v-model="ruleForm.jiazhangshouji"               placeholder="家长手机" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='jiazhang'"  label="身份证" prop="shenfenzheng">
          <el-input v-model="ruleForm.shenfenzheng"               placeholder="身份证" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item v-if="flag=='jiazhang'"  label="班主任工号" prop="banzhurengonghao">
          <el-select v-model="ruleForm.banzhurengonghao"  placeholder="请选择班主任工号">
            <el-option
                v-for="(item,index) in jiazhangbanzhurengonghaoOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
      <el-form-item v-if="flag=='users'" label="用户名" prop="username">
        <el-input v-model="ruleForm.username" 
        placeholder="用户名"></el-input>
      </el-form-item>
      <el-col :span="24">
      <el-form-item>
        <el-button type="primary" @click="onUpdateHandler">修 改</el-button>
      </el-form-item>
      </el-col>
      </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isMobile,isPhone,isURL,checkIdCard } from "@/utils/validate";

export default {
  data() {
    return {
      ruleForm: {},
      flag: '',
      usersFlag: false,
      banzhurenxingbieOptions: [],
      jiazhangxingbieOptions: [],
      jiazhangbanzhurengonghaoOptions: [],
    };
  },
  mounted() {
    var table = this.$storage.get("sessionTable");
    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
    this.banzhurenxingbieOptions = "男,女".split(',')
    this.jiazhangxingbieOptions = "男,女".split(',')
    this.$http({
      url: `option/banzhuren/banzhurengonghao`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.jiazhangbanzhurengonghaoOptions = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
  },
  methods: {
    banzhurenzhaopianUploadChange(fileUrls) {
        this.ruleForm.zhaopian = fileUrls;
    },
    jiazhangzhaopianUploadChange(fileUrls) {
        this.ruleForm.zhaopian = fileUrls;
    },
    onUpdateHandler() {
      if((!this.ruleForm.mima)&& 'banzhuren'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
        if(this.ruleForm.zhaopian!=null) {
                this.ruleForm.zhaopian = this.ruleForm.zhaopian.replace(new RegExp(this.$base.url,"g"),"");
        }
      if( 'banzhuren' ==this.flag && this.ruleForm.banzhurendianhua&&(!isMobile(this.ruleForm.banzhurendianhua))){
        this.$message.error(`班主任电话应输入手机格式`);
        return
      }
      if((!this.ruleForm.shenfenzheng)&& 'banzhuren'==this.flag){
        this.$message.error('身份证不能为空');
        return
      }
      if( 'banzhuren' ==this.flag && this.ruleForm.shenfenzheng&&(!checkIdCard(this.ruleForm.shenfenzheng))){
        this.$message.error(`身份证应输入身份证格式`);
        return
      }
      if((!this.ruleForm.gongzuozheng)&& 'banzhuren'==this.flag){
        this.$message.error('工作证不能为空');
        return
      }
      if((!this.ruleForm.jiazhangzhanghao)&& 'jiazhang'==this.flag){
        this.$message.error('家长账号不能为空');
        return
      }
      if((!this.ruleForm.mima)&& 'jiazhang'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
      if( 'jiazhang' ==this.flag && this.ruleForm.nianling&&(!isIntNumer(this.ruleForm.nianling))){
       this.$message.error(`年龄应输入整数`);
        return
      }
        if(this.ruleForm.zhaopian!=null) {
                this.ruleForm.zhaopian = this.ruleForm.zhaopian.replace(new RegExp(this.$base.url,"g"),"");
        }
      if((!this.ruleForm.jiazhangshouji)&& 'jiazhang'==this.flag){
        this.$message.error('家长手机不能为空');
        return
      }
      if( 'jiazhang' ==this.flag && this.ruleForm.jiazhangshouji&&(!isMobile(this.ruleForm.jiazhangshouji))){
        this.$message.error(`家长手机应输入手机格式`);
        return
      }
      if((!this.ruleForm.shenfenzheng)&& 'jiazhang'==this.flag){
        this.$message.error('身份证不能为空');
        return
      }
      if( 'jiazhang' ==this.flag && this.ruleForm.shenfenzheng&&(!checkIdCard(this.ruleForm.shenfenzheng))){
        this.$message.error(`身份证应输入身份证格式`);
        return
      }
      if((!this.ruleForm.banzhurengonghao)&& 'jiazhang'==this.flag){
        this.$message.error('班主任工号不能为空');
        return
      }
      if('users'==this.flag && this.ruleForm.username.trim().length<1) {
	this.$message.error(`用户名不能为空`);
        return	
      }
      this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
</style>
