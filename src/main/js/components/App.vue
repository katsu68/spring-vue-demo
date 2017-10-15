<template>
	<div class="row">
		<div class="col-ms-2 col-md-2">
			<div class="panel panel-default">
				<div class="panel-heading">
					Menu
				</div>
				<ul class="nav nav-pills nav-stacked">
					<li><router-link to="/">Home</router-link></li>
					<li><router-link to="/products">Products</router-link></li>
				</ul>
			</div>
		</div>

		<div class="col-ms-10 col-md-10">
			<router-view></router-view>
		</div>
	</div>
</template>

<script>
	import "bootstrap/dist/css/bootstrap.min.css";

	export default {
		mounted() {
			this.$store.dispatch("getProducts");
		}
	}
</script>