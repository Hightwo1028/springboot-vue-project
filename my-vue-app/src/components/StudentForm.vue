<template>
  <div>
    <h2>新增學生資料</h2>
    <input type="text" v-model="student.id" placeholder="學生ID" />
    <input type="text" v-model="student.name" placeholder="學生姓名" />
    <button @click="submitStudent">提交</button>
  </div>
</template>

<script setup>
import { ref } from 'vue';
import axios from 'axios';

// 定義狀態
const student = ref({
  id: '',
  name: ''
});

// 發送 POST 請求的函數
const submitStudent = () => {
  axios.post('http://localhost:8080/students', student.value)
      .then(response => {
        console.log('成功:', response.data);
      })
      .catch(error => {
        console.error('錯誤:', error);
      });
};
</script>

<style scoped>
/* 這裡可以添加你的樣式 */
</style>