<template>
	<view class="content">
		<form class="app-update-pv">
			 
			<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"180rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">评议标题</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"12rpx 0","borderColor":"rgba(107, 125, 144, 1)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"8rpx 2rpx 2rpx","width":"calc(100% - 180rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.pingyibiaoti" v-model="ruleForm.pingyibiaoti" placeholder="评议标题"></input>
			</view>
			<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group" @tap="pingyifengmianTap">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"180rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">评议封面</view>
				<view class="right-input" style="padding:0">
					<image :style='{"padding":"0","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","borderRadius":"100%","borderWidth":"0","width":"88rpx","borderStyle":"solid","height":"88rpx"}' class="avator" v-if="ruleForm.pingyifengmian" :src="baseUrl+ruleForm.pingyifengmian" mode="aspectFill"></image>
					<image :style='{"padding":"0","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","borderRadius":"100%","borderWidth":"0","width":"88rpx","borderStyle":"solid","height":"88rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
			<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"180rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">申请时间</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"12rpx 0","borderColor":"rgba(107, 125, 144, 1)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"8rpx 2rpx 2rpx","width":"calc(100% - 180rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.shenqingshijian" v-model="ruleForm.shenqingshijian" placeholder="申请时间"></input>
			</view>
			<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"180rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">班主任工号</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"12rpx 0","borderColor":"rgba(107, 125, 144, 1)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"8rpx 2rpx 2rpx","width":"calc(100% - 180rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.banzhurengonghao" v-model="ruleForm.banzhurengonghao" placeholder="班主任工号"></input>
			</view>
			<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"180rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">班主任姓名</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"12rpx 0","borderColor":"rgba(107, 125, 144, 1)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"8rpx 2rpx 2rpx","width":"calc(100% - 180rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.banzhurenxingming" v-model="ruleForm.banzhurenxingming" placeholder="班主任姓名"></input>
			</view>
			<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"180rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">家长账号</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"12rpx 0","borderColor":"rgba(107, 125, 144, 1)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"8rpx 2rpx 2rpx","width":"calc(100% - 180rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.jiazhangzhanghao" v-model="ruleForm.jiazhangzhanghao" placeholder="家长账号"></input>
			</view>
			<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"180rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">家长姓名</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"12rpx 0","borderColor":"rgba(107, 125, 144, 1)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"8rpx 2rpx 2rpx","width":"calc(100% - 180rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.jiazhangxingming" v-model="ruleForm.jiazhangxingming" placeholder="家长姓名"></input>
			</view>
			<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"180rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">学生姓名</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"12rpx 0","borderColor":"rgba(107, 125, 144, 1)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"8rpx 2rpx 2rpx","width":"calc(100% - 180rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.xueshengxingming" v-model="ruleForm.xueshengxingming" placeholder="学生姓名"></input>
			</view>
			<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"180rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">贫困等级</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"12rpx 0","borderColor":"rgba(107, 125, 144, 1)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"8rpx 2rpx 2rpx","width":"calc(100% - 180rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.pinkundengji" v-model="ruleForm.pinkundengji" placeholder="贫困等级"></input>
			</view>
			<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"180rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">学校班级</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"12rpx 0","borderColor":"rgba(107, 125, 144, 1)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"8rpx 2rpx 2rpx","width":"calc(100% - 180rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.xuexiaobanji" v-model="ruleForm.xuexiaobanji" placeholder="学校班级"></input>
			</view>
			<view :style='{"padding":"0 16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"180rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">评议时间</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"12rpx 0","borderColor":"rgba(107, 125, 144, 1)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"8rpx 2rpx 2rpx","width":"calc(100% - 180rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.pingyishijian" placeholder="评议时间" @tap="toggleTab('pingyishijian')"></input>
			</view>
			
			<!-- 否 -->
 

			<view :style='{"padding":"16rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"180rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">评议内容</view>
				<textarea :style='{"padding":"20rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(107, 125, 144, 1)","borderRadius":"0","color":"rgba(0, 0, 0, 1)","borderWidth":"8rpx 2rpx 2rpx","width":"calc(100% - 180rpx)","fontSize":"28rpx","borderStyle":"solid","height":"240rpx"}' v-model="ruleForm.pingyineirong" placeholder="评议内容"></textarea>
			</view>
			
			
			<view class="btn" >
				<button :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","margin":"0 auto","backgroundColor":"rgba(107, 125, 144, 1)","borderColor":"#409EFF","borderRadius":"0","color":"#fff","borderWidth":"0","width":"60%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

		<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="pingyishijianConfirm" ref="pingyishijian" themeColor="#333333"></w-picker>
			
	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				cross:'',
				ruleForm: {
				pingyibiaoti: '',
				pingyifengmian: '',
				shenqingshijian: '',
				banzhurengonghao: '',
				banzhurenxingming: '',
				jiazhangzhanghao: '',
				jiazhangxingming: '',
				xueshengxingming: '',
				pinkundengji: '',
				xuexiaobanji: '',
				pingyineirong: '',
				pingyishijian: '',
				sfsh: '',
				shhf: '',
				},
				// 登陆用户信息
				user: {},
                                ro:{
                                   pingyibiaoti : false,
                                   pingyifengmian : false,
                                   shenqingshijian : false,
                                   banzhurengonghao : false,
                                   banzhurenxingming : false,
                                   jiazhangzhanghao : false,
                                   jiazhangxingming : false,
                                   xueshengxingming : false,
                                   pinkundengji : false,
                                   xuexiaobanji : false,
                                   pingyineirong : false,
                                   pingyishijian : false,
                                   sfsh : false,
                                   shhf : false,
                                },
			}
		},
		components: {
			wPicker
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},



		},
		async onLoad(options) {
        		this.ruleForm.pingyishijian = this.$utils.getCurDateTime();

			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取
			this.ruleForm.banzhurengonghao = this.user.banzhurengonghao
			this.ro.banzhurengonghao = true;
			this.ruleForm.banzhurenxingming = this.user.banzhurenxingming
			this.ro.banzhurenxingming = true;



			// 如果有登陆，获取登陆后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`zizhupingyi`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='pingyibiaoti'){
					this.ruleForm.pingyibiaoti = obj[o];
					this.ro.pingyibiaoti = true;
					continue;
					}
					if(o=='pingyifengmian'){
					this.ruleForm.pingyifengmian = obj[o];
					this.ro.pingyifengmian = true;
					continue;
					}
					if(o=='shenqingshijian'){
					this.ruleForm.shenqingshijian = obj[o];
					this.ro.shenqingshijian = true;
					continue;
					}
					if(o=='banzhurengonghao'){
					this.ruleForm.banzhurengonghao = obj[o];
					this.ro.banzhurengonghao = true;
					continue;
					}
					if(o=='banzhurenxingming'){
					this.ruleForm.banzhurenxingming = obj[o];
					this.ro.banzhurenxingming = true;
					continue;
					}
					if(o=='jiazhangzhanghao'){
					this.ruleForm.jiazhangzhanghao = obj[o];
					this.ro.jiazhangzhanghao = true;
					continue;
					}
					if(o=='jiazhangxingming'){
					this.ruleForm.jiazhangxingming = obj[o];
					this.ro.jiazhangxingming = true;
					continue;
					}
					if(o=='xueshengxingming'){
					this.ruleForm.xueshengxingming = obj[o];
					this.ro.xueshengxingming = true;
					continue;
					}
					if(o=='pinkundengji'){
					this.ruleForm.pinkundengji = obj[o];
					this.ro.pinkundengji = true;
					continue;
					}
					if(o=='xuexiaobanji'){
					this.ruleForm.xuexiaobanji = obj[o];
					this.ro.xuexiaobanji = true;
					continue;
					}
					if(o=='pingyineirong'){
					this.ruleForm.pingyineirong = obj[o];
					this.ro.pingyineirong = true;
					continue;
					}
					if(o=='pingyishijian'){
					this.ruleForm.pingyishijian = obj[o];
					this.ro.pingyishijian = true;
					continue;
					}
				}
			}
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv .cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},

			// 多级联动参数


			// 日长控件选择日期时间
			pingyishijianConfirm(val) {
				console.log(val)
				this.ruleForm.pingyishijian = val.result;
				this.$forceUpdate();
			},


			pingyifengmianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.pingyifengmian = 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},

			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {





























//跨表计算判断
				if((!this.ruleForm.pingyibiaoti)){
					this.$utils.msg(`评议标题不能为空`);
					return
				}
				if((!this.ruleForm.pingyifengmian)){
					this.$utils.msg(`评议封面不能为空`);
					return
				}
				//更新跨表属性
			       var crossuserid;
			       var crossrefid;
			       var crossoptnum;
				if(this.cross){
					var statusColumnName = uni.getStorageSync('statusColumnName');
					var statusColumnValue = uni.getStorageSync('statusColumnValue');
					if(statusColumnName!='') {
						var obj = uni.getStorageSync('crossObj');
						if(!statusColumnName.startsWith("[")) {
							for (var o in obj){
								if(o==statusColumnName){
									obj[o] = statusColumnValue;
								}

							}
							var table = uni.getStorageSync('crossTable');
							await this.$api.update(`${table}`, obj);
						} else {
						       crossuserid=Number(uni.getStorageSync('userid'));
						       crossrefid=obj['id'];
						       crossoptnum=uni.getStorageSync('statusColumnName');
						       crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
						}
					}
				}
				if(crossrefid && crossuserid) {
					this.ruleForm.crossuserid=crossuserid;
					this.ruleForm.crossrefid=crossrefid;
					let params = {
						page: 1,
						limit:10,
						crossuserid:crossuserid,
						crossrefid:crossrefid,
					}
					let res = await this.$api.list(`zizhupingyi`, params);
					if (res.data.total >= crossoptnum) {
						this.$utils.msg(uni.getStorageSync('tips'));
						return false;
					} else {
                //跨表计算
						if(this.ruleForm.id){
							await this.$api.update(`zizhupingyi`, this.ruleForm);
						}else{
							await this.$api.add(`zizhupingyi`, this.ruleForm);
						}
						this.$utils.msgBack('提交成功');
					}
				} else {
                //跨表计算
					if(this.ruleForm.id){
						await this.$api.update(`zizhupingyi`, this.ruleForm);
					}else{
						await this.$api.add(`zizhupingyi`, this.ruleForm);
					}
					this.$utils.msgBack('提交成功');
				}
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
		background-image: url(http://codegen.caihongy.cn/20220217/d6ae3e5bfd5b48eebf452aa2975b6d18.png);
		background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}
	
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	  padding: 20upx 0;
	}
	
	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}
	
	.cu-form-group+.cu-form-group {
		border: 0;
	}
	
	.cu-form-group uni-input {
		padding: 0 30upx;
	}
	
	.uni-input {
		padding: 0 30upx;
	}
	
	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}
	
	.cu-form-group uni-picker::after {
		line-height: 88rpx;
	}
	
	.select .uni-input {
		line-height: 88rpx;
	}
	
	.input .right-input {
		line-height: 88rpx;
	}
</style>
